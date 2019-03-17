package com.example.albumsapidbcallkotlin.Home



class AlbumsAdapter:RecyclerView.Adapter<AlbumsAdapter.AlbumViewHolder>() {

    private val albumsData = ArrayList<AlbumsItem>()

    fun setData(albums : List<AlbumItem>) {
        albumsData.clear()
        albumsData.addAll(albums)
        notfiydataSetChanged()
    }

    override fun onBindViewHolder (albumsViewHolder: AlbumsViewHolder, position: Int) {
        albumsViewHolder.tvTitle.text = albumsData
        albumsViewHolder.tvId.text = albumsData.toString()
        albumsViewHolder.tvUsId.text = albumsData.userId.toString()
    }

override fun onCreateViewHolder(parent: ViewGroup,p1: Int): AlbumsViewHolder {
    val view = LayoutInflater.from(parent.context.inflate(R.layout.albums_item,parent,false)
    return AlbumsViewHolder(view)
}

    override fun getItemCount() = albumsData.size




    class AlbumsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvABTitle: TextView = view.findViewById(R.id.tvABTitle)
        val tvId: TextView = view.findViewById(R.id.tvId)
        val tvuserID: TextView = view.findViewById(R.id.tvuserID)
    }
}

