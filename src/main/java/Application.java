import com.em.beans.Books;
import com.em.user.Student;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) throws Exception {
//        Student student = new Student();
//        student.Say();
        BeanInfo info = Introspector.getBeanInfo(Books.class);
        System.out.println("\n---------------------------------------------\n");
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            Method method = pd.getReadMethod();
        }
        System.out.println("\n---------------------------------------------\n");
    }
}
