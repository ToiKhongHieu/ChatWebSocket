package thi.nguyen.chat.thinguyen_chatapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import thi.nguyen.chat.thinguyen_chatapp.entities.Room;

public interface RoomRepository extends MongoRepository<Room, String> {
    //get room using room id
    Room findByRoomId(String roomId);
}
