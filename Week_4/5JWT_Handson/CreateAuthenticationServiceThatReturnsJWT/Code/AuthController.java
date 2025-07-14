@RestController
public class AuthController {
    @Value("${jwt.secret}")
    private String secretKey;

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        String[] credentials = new String(Base64.getDecoder().decode(authHeader.substring(6))).split(":");
        String username = credentials[0];

        // Just generate token for demo
        String jwt = Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 1000))
                .signWith(SignatureAlgorithm.HS256, secretKey).compact();

        return Collections.singletonMap("token", jwt);
    }
}
