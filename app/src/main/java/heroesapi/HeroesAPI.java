package heroesapi;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface HeroesAPI {


    @FormUrlEncoded
     @POST("heroes")
    Call<Void> addHero(@FieldMap Map<String,String> map);

}
