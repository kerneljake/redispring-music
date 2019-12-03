package com.redislabs.redispringmusic;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import lombok.Data;
@Data
@RedisHash("album")
public class Album {
	@Id
	String id;
	String title;
	String artist;
	String year;
	String genre;
	String cover;
}
