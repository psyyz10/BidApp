/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/*Change href if the user log in*/
function changeHref(obj)
{
	document.getElementById("myname").innerHTML = "Hi, "+obj;
	document.getElementById("myname").href = "profilePage.jsp";
        document.getElementById("log").innerHTML = "Log out";
        document.getElementById("log").href = "LogoutServlet";
}