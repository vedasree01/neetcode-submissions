class Solution {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        String output = "";
        for (String content : paths) {
            if (content.isEmpty() || content.equals(".")) {
                continue;
            }

            if (content.equals("..")) {
                if (!stack.isEmpty())
                    stack.pollLast();
            } else {
                stack.offerLast(content);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String dir : stack) {
            sb.append("/").append(dir);
        }

        return sb.length() > 0 ? sb.toString() : "/";
    }
}