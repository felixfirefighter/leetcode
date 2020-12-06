/**
 * Definition for a Node.
 * type Node struct {
 *     Val int
 *     Left *Node
 *     Right *Node
 *     Next *Node
 * }
 */

func connect(root *Node) *Node {
	if root == nil {
		return root
	}

	cur := root
	tempHead := &Node{}
	p := tempHead

	for cur != nil {
		if cur.Left != nil {
			p.Next = cur.Left
			p = p.Next
		}

		if cur.Right != nil {
			p.Next = cur.Right
			p = p.Next
		}

		if cur.Next != nil {
			cur = cur.Next
		} else {
			cur = tempHead.Next
			tempHead.Next = nil
			p = tempHead
		}
	}

	return root
}