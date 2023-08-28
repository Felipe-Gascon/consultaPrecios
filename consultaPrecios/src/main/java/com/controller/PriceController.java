@RestController
@RequestMapping("/prices")
public class PriceController {
    @Autowired
    private PriceService priceService;

    @GetMapping("/applicable")
    public ResponseEntity<Price> getApplicablePrice(
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date,
            @RequestParam("productId") Long productId,
            @RequestParam("brandId") Integer brandId) {

        Price price = priceService.findApplicablePrice(date, productId, brandId);
        return price != null ? ResponseEntity.ok(price) : ResponseEntity.notFound().build();
    }
}
