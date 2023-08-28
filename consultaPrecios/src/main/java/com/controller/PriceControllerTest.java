@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PriceControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void test1() {
        LocalDateTime date = LocalDateTime.of(2020, 6, 14, 10, 0);
        Price price = restTemplate.getForObject("/prices/applicable?date=" + date + "&productId=35455&brandId=1", Price.class);
        assertEquals(BigDecimal.valueOf(25.45), price.getPrice());
    }

    @Test
    void test2() {
        LocalDateTime date = LocalDateTime.of(2020, 6, 14, 16, 0);
        Price price = restTemplate.getForObject("/prices/applicable?date=" + date + "&productId=35455&brandId=1", Price.class);
        assertEquals(BigDecimal.valueOf(25.45), price.getPrice());
    }

    @Test
    void test3() {
        LocalDateTime date = LocalDateTime.of(2020, 6, 14, 21, 0);
        Price price = restTemplate.getForObject("/prices/applicable?date=" + date + "&productId=35455&brandId=1", Price.class);
        assertEquals(BigDecimal.valueOf(25.45), price.getPrice());
    }

    @Test
    void test4() {
        LocalDateTime date = LocalDateTime.of(2020, 6, 15, 10, 0);
        Price price = restTemplate.getForObject("/prices/applicable?date=" + date + "&productId=35455&brandId=1", Price.class);
        assertEquals(BigDecimal.valueOf(25.45), price.getPrice());
    }
    @Test
    void test5() {
        LocalDateTime date = LocalDateTime.of(2020, 6, 16, 21, 0);
        Price price = restTemplate.getForObject("/prices/applicable?date=" + date + "&productId=35455&brandId=1", Price.class);
        assertEquals(BigDecimal.valueOf(25.45), price.getPrice());
    }
    // Repite para test2, test3, test4, test5 con las fechas y horas correspondientes.
}
