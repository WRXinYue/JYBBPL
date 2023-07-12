package service.imp;

import controller.request.LoginRequest;
import entity.Admin;
import lombok.extern.slf4j.Slf4j;
import mapper.AdminMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import controller.dto.LoginDTO;
import exception.ServiceException;
import service.IAdminService;

import java.util.List;

@Slf4j
@Service
public class AdminService implements IAdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public List<Admin> list() {
        return adminMapper.list();
    }

//    @Override
//    public PageInfo<Admin> page(BaseRequest baseRequest) {
//        PageHelper.startPage(baseRequest.getPageNum(), baseRequest.getPageSize());
//        List<Admin> admins = adminMapper.listByCondition(baseRequest);
//        return new PageInfo<>(admins);
//    }

    @Override
    public void save(Admin admin) {
        adminMapper.save(admin);
    }

    @Override
    public Admin geyById(Integer id) {
        return adminMapper.getById(id);
    }

    @Override
    public void update(Admin admin) {
//        admin.setUpdatetime(new Date());
        adminMapper.updateById(admin);
    }

    @Override
    public void deleteById(Integer id) {
        adminMapper.deleteById(id);
    }

    @Override
    public LoginDTO login(LoginRequest request) {
        Admin admin = adminMapper.getByUsernameAndPassword(request);
        if (admin == null) {
            // 解决用户账号密码输入错误,自定义异常情况
            //不推荐在控制层返回错误数据，这不符合规范逻辑，所以在exception进行编写
            throw new ServiceException("用户名或密码错误");
        }
        LoginDTO loginDTO = new LoginDTO();
        BeanUtils.copyProperties(admin, loginDTO);
        return loginDTO;
    }
}
