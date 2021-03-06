package ds.dbtests.db.orma;


import android.support.annotation.Nullable;

import com.github.gfx.android.orma.SingleAssociation;
import com.github.gfx.android.orma.annotation.*;

import java.util.Date;

@Table
public class OrderOrma {

    @PrimaryKey/*(autoincrement = true)*/ public long id;
    @Column public String title;
    @Column public String description;
    @Column public Date expiration;
    @Column public Date created;
    @Column public int count;
    @Column public double price;

    //@Column public long userId;
    @Nullable
    @Column(indexed = true) public SingleAssociation<UserOrma> user;


}

