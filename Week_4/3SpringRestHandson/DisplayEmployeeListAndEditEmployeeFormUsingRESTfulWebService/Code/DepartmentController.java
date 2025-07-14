@RestController
public class DepartmentController {
    @Autowired
    DepartmentService service;

    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        return service.getAllDepartments();
    }
}
