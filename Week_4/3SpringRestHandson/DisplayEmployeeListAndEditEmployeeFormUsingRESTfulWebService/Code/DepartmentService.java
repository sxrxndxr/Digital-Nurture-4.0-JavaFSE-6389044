@Service
public class DepartmentService {
    @Autowired
    DepartmentDao dao;

    public List<Department> getAllDepartments() {
        return dao.getAllDepartments();
    }
}
