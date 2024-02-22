package hei.school.sarisary.endpoint.rest.controller.health;
import hei.school.sarisary.service.event.SaryService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class SaryController {
        private final SaryService saryService;

        @PutMapping(value = "/black-and-white/{id}", produces = MediaType.IMAGE_PNG_VALUE)
        public byte[] toBlackAndWhite(@PathVariable String key, @RequestBody byte[] image) {
            return saryService.convertToBlackAndWhite(image, key);
        }

}
