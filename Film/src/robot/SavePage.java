package robot;//1行
import java.io.*;
import java.net.*;

import mysql.SQLUpdate;
public class SavePage {
	public static void savePage(URL pageURL,Film film){
		film.href = pageURL.toExternalForm();
		SQLUpdate.use(2, film);
	}//30行
}
