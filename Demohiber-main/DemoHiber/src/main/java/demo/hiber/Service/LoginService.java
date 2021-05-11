package demo.hiber.Service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import demo.hiber.Model.User;
import demo.hiber.util.HiberUtil;

public class LoginService {

	public static boolean authenticateUser(String userid, String password) {
		// TODO Auto-generated method stub
		User user=getUserbyId(userid);
		if(user!=null && userid.equals(user.getUserid())&&password.equals(user.getPass()))
		{
			return true;
		}
		else {
		return false;
	
		}}

	private static User getUserbyId(String userid) {
		// TODO Auto-generated method stub
		Session session=HiberUtil.openSession();
		Transaction trans=null;
		User user=null;
		trans=session.beginTransaction();
		user=(User) session.get(User.class, userid);
		trans.commit();
		return user;
	}

}
