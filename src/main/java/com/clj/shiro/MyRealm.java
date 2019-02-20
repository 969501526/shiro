package com.clj.shiro;

import com.clj.dao.ResourcesMapper;
import com.clj.dao.RoleMapper;
import com.clj.dao.UserMapper;
import com.clj.entity.Resources;
import com.clj.entity.Role;
import com.clj.entity.User;
import com.clj.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.*;

public class MyRealm extends AuthorizingRealm {

    @Autowired
    private UserMapper userService;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private ResourcesMapper resourcesMapper;

    //授权
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        String username = (String) principalCollection.getPrimaryPrincipal();
        Set<String> roles = getRolesByUsername(username);

        Set<String> permissions = getPermissionsByUsername(username);
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setStringPermissions(permissions);
        authorizationInfo.setRoles(roles);
        return authorizationInfo;
    }

    //设置权限信息
    private Set<String> getPermissionsByUsername(String username) {
        List<Role> list = roleMapper.getUserByRoleId(username);
        List<String> url = new ArrayList<String>();
        for(Role role :list){
            List<Resources> resources = resourcesMapper.getRoleByResoures(role.getRoleId());
            if(!resources.isEmpty()){
                for(Resources resources1 : resources){
                    url.add(resources1.getResourcesUrl());
                }
            }
        }
        Set<String> permissions = new HashSet<String>(url);
        return permissions;
    }

    //设置角色信息
    private Set<String> getRolesByUsername(String usernmae) {
        List<Role> role = roleMapper.getUserByRoles(usernmae);
        List<String> role_name = new ArrayList<String>();
       for(Role role1 : role){
           role_name.add(role1.getRoleName());
       }
        Set<String> roles = new HashSet<String>(role_name);
        return roles;
    }

    //认证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        //1、通过主体传过来信息获取用户名
        String username = (String) authenticationToken.getPrincipal();
        //2、通过用户名到数据库中获取凭证
        User user = getPasswordByUsername(username);
        if(user == null){
            return null;
        }
        SimpleAuthenticationInfo authenticationInfo  = new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(),"nick");
        authenticationInfo.setCredentialsSalt(ByteSource.Util.bytes(user.getUsername()));
        return authenticationInfo;
    }

    /**
     * 模拟数据库获取凭证
     * @param username
     * @return
     */
    private User getPasswordByUsername(String username) {
        User user = userService.getPasswordByUsername(username);
        return user;
    }

    public static void main(String[] args){
        Md5Hash md5Hash = new Md5Hash("123456","456789");
        System.out.println(md5Hash.toString());
    }
}
