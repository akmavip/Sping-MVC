/*
 * //package ptithcm.controller; // //import javax.servlet.http.HttpSession;
 * //import javax.transaction.Transactional; // //import org.hibernate.Query;
 * //import org.hibernate.Session; //import org.hibernate.SessionFactory;
 * //import org.springframework.beans.factory.annotation.Autowired; //import
 * org.springframework.stereotype.Controller; //import
 * org.springframework.ui.ModelMap; //import
 * org.springframework.validation.BindingResult; //import
 * org.springframework.validation.annotation.Validated; //import
 * org.springframework.web.bind.annotation.ModelAttribute; //import
 * org.springframework.web.bind.annotation.RequestMapping; //import
 * org.springframework.web.bind.annotation.RequestMethod; // //import
 * ptithcm.bean.ForgotPassword; //import ptithcm.bean.LogIn; // // //
 * //@Transactional //@Controller //@RequestMapping("account/") //public class
 * AccountController { // // @Autowired // SessionFactory factory; //
 * // @RequestMapping(value="index", method=RequestMethod.GET) // public String
 * account(ModelMap model){ // model.addAttribute("login", new LogIn()); //
 * return "account/index"; // } // // // @RequestMapping(value="login",
 * method=RequestMethod.POST) public String // account_login(ModelMap
 * model, @Validated @ModelAttribute("login") LogIn // login, BindingResult
 * errors, HttpSession ss){ // // if (errors.hasErrors()) { return
 * "account/index"; } // // Session session = factory.getCurrentSession();
 * String hql = //
 * "FROM Account where accountname = :accountname and password = :password"; try
 * // { Query query = session.createQuery(hql);
 * query.setParameter("accountname", // login.getAccountName());
 * query.setParameter("password", login.getPassword()); // // Account account =
 * (Account) query.list().get(0); // model.addAttribute("account", account); //
 * // // ss.setAttribute("user", "admin"); return "redirect:/home/index.htm"; //
 * // }catch(Exception e) { model.addAttribute("message", //
 * "<div style='color:red;margin-top: 25px;'>Login Unsuccessful </div>"); return
 * // "account/index"; } } // // // @RequestMapping(value="logout") // public
 * String Logout(HttpSession ss) // { // ss.removeAttribute("user"); // return
 * "redirect:/account/index.htm"; // } // // @RequestMapping(value =
 * "forgetPassword", method = RequestMethod.GET) // public String
 * forgot_password(ModelMap model) { // // model.addAttribute("forgotPassword",
 * new ForgotPassword()); // return "account/forgotPassword"; // } //
 * // @RequestMapping(value = "forgetPassword", method = RequestMethod.POST) //
 * public String forgot_password(ModelMap
 * model, @Validated @ModelAttribute("forgotPassword") ForgotPassword
 * forgotPassword // , BindingResult errors) { // // if (errors.hasErrors()) {
 * // return "account/forgotPassword"; // }else { //
 * if(forgotPassword.getEmail().equals("huynhngoccanh3010@gmail.com") &&
 * forgotPassword.getPassword().equals("123")) { //
 * model.addAttribute("message",
 * "<div style='color:green;margin-top: 25px;'>New password has been emailed </div>"
 * ); // }else { // model.addAttribute("message",
 * "<div style='color:red;margin-top: 25px;'>Email or password is wrong </div>"
 * ); // } // } // return "account/forgotPassword"; // } //}
 */