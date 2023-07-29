package org.example.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PokemonProduct {

        private String url;
        private String image;
        private String name;
        private String price;

        // getters and setters omitted for brevity...

        @Override
        public String toString() {
            return "{ \"url\":\"" + url + "\", "
                    + " \"image\": \"" + image + "\", "
                    + "\"name\":\"" + name + "\", "
                    + "\"price\": \"" + price + "\" }";
        }

}
