public class FlexerGenerator {
    public static void main(String[] args) {
        new freditor.FlexerGenerator(-8, 9)
                .withIdentifierCall("symbol(input)")
                .generateTokens(
                        "false", "nil", "true",
                        "(", ")", "[", "]", "{", "}"
                );
    }
}
