package service;

import controller.request.LoginRequest;
import entity.Admin;
import controller.dto.LoginDTO;

import java.util.List;

public interface IAdminService {

    List<Admin> list();

//    PageInfo<Admin> page(BaseRequest baseRequest);

    void save(Admin admin);

    Admin geyById(Integer id);

    void update(Admin admin);

    void deleteById(Integer id);

    LoginDTO login(LoginRequest request);
}
