package springetest.service;

import java.util.List;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springetest.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	public void process(List<String> filePath) throws JAXBException {
		userDao.process(filePath);
		
	}

}
