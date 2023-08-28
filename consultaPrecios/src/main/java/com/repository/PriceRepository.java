public interface PriceRepository extends JpaRepository<Price, Long> {
    List<Price> findByStartDateBeforeAndEndDateAfterAndProductIdAndBrandIdOrderByPriorityDesc(LocalDateTime date, LocalDateTime date2, Long productId, Integer brandId);
}
