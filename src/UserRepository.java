public interface UserRepository {
    default String  getLocation(String userId)
    {
        /// code here to get user repo
        return "UE";
    }
}