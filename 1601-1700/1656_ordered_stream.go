type OrderedStream struct {
	ptr  int
	list []string
}

func Constructor(n int) OrderedStream {
	return OrderedStream{
		ptr:  1,
		list: make([]string, n+1),
	}
}

func (this *OrderedStream) Insert(id int, value string) []string {
	var res []string

	this.list[id] = value

	for this.ptr < len(this.list) && len(this.list[this.ptr]) != 0 {
		res = append(res, this.list[this.ptr])
		this.ptr++
	}

	return res
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * obj := Constructor(n);
 * param_1 := obj.Insert(id,value);
 */