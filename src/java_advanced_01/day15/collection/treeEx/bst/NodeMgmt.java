//package java_advanced_01.day15.collection.treeEx.bst;
//
//
//public class NodeMgmt {
//    Node head = null; // = root
//
//
//    // 노드 클래스 만들기
//    public class Node {
//        Node left, right;
//        int value;
//
//        public Node(int value) {
//            this.value = value;
//            this.left = null;
//            this.right = null;
//        }
//    }
//
//    public boolean insertNode(int data) {
//        // Case1 : 노드가 하나도 없는 경우
//        if (head == null) {
//            this.head = new Node(data);
//        } else { // Case2 : 노드가 하나 이상 있을 경우
//            Node findNode = this.head;
//            while (true) {
//                // Case 2-1 : 현재 노드 왼쪽에 노드가 들어가야 할 경우
//                if (findNode.value > data) Node left = new Node(data);
//                // Case 2-2 : 현재 노드 오른쪽에 노드가 들어가야 할 경우
//
//            }
//        }
//        return true;
//    }
//}
