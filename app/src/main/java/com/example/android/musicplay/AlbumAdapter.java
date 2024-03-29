package com.example.android.musicplay;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<Album> {
    private static final String LOG_TAG = ArtistAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param androidFlavors A List of AndroidFlavor objects to display in a list
     */
    public AlbumAdapter(Activity context, ArrayList<Album> androidFlavors) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, androidFlavors);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_albums, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Album currentAlbum = getItem(position);

        // Find the TextView in the list_artistssts.xml layout with the ID version_name
        TextView albumName = (TextView) listItemView.findViewById(R.id.album_name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        albumName.setText(currentAlbum.getAlbumName());

        // Find the TextView in the list_artistssts.xml layout with the ID version_name
        TextView albumType = (TextView) listItemView.findViewById(R.id.album_type);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        albumType.setText(currentAlbum.getAlbumType());


        // Find the TextView in the list_artistssts.xml layout with the ID version_number
        TextView albumArtist = (TextView) listItemView.findViewById(R.id.album_artistName);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        albumArtist.setText(currentAlbum.getAlbumArtist());


        // Find the TextView in the list_artistssts.xml layout with the ID version_number
        TextView albumYear = (TextView) listItemView.findViewById(R.id.album_year);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        albumYear.setText(currentAlbum.getAlbumYear());

//        // Find the ImageView in the list_artistssts.xml layout with the ID list_item_icon
        ImageView albumPicture = (ImageView) listItemView.findViewById(R.id.album_pic);
//        // Get the image resource ID from the current AndroidFlavor object and
//        // set the image to iconView
        albumPicture.setImageResource(currentAlbum.getAlbumPicId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
