
module com.utils {
    exports com.utils;
}
module com.greetings {
    requires com.utils;
}
package com.utils;

public class Utility {
    public static String getMessage() {
        return "Hello from Utility!";
    }
}


package com.greetings;

import com.utils.Utility;

public class Main {
    public static void main(String[] args) {
        System.out.println(Utility.getMessage());
    }
}