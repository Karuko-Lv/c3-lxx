package Task5.Exer;

/**
 * @author LXX
 * @date 2021/3/3-15:30
 */
public class DivideZeroException {
    public static void main(String[] args) throws Exception {
        try {
            int i = 3 / 0;
        } catch (Exception e) {
            throw new DivideZeroException().new TCPException("发生了除0错误");
        }
    }

    public class TCPException extends Exception {
        public TCPException() {
        }

        public TCPException(String s) {
            super(s);
        }
    }
//    public class TCPException extends RuntimeException {
//
//        private static final long serialVersionUID = 2256477558314496007L;
//
//        public TCPException() {
//        }
//
//        public TCPException(String s) {
//            super(s);
//        }
//    }
}
