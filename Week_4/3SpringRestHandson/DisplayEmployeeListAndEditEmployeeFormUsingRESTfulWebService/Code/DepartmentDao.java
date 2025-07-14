@Repository
public class DepartmentDao {
    public List<Department> getAllDepartments() {
        ApplicationContext context = new ClassPathXmlApplicationContext("department.xml");
        return context.getBean("departmentList", List.class);
    }
}
