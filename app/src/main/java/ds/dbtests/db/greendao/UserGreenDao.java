package ds.dbtests.db.greendao;

import android.support.annotation.NonNull;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Convert;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinProperty;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.converter.PropertyConverter;

import java.util.Collection;
import java.util.List;

import ds.dbtests.db.Order;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "USER_GREEN_DAO".
 */
@Entity(active = true)
public class UserGreenDao implements /*java.io.Serializable,*/ ds.dbtests.db.User {

    @Id(autoincrement = true)
    private Long id;
    private int age;
    private double height;
    private String name;
    private String login;
    private String password;
    private String sex;
    private String description;
    private String phone;

    @Convert(converter = OrderSerializer.class, columnType = byte[].class)
    private List<OrderGreenDao> rawOrders;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 1911154127)
    private transient UserGreenDaoDao myDao;
    @ToMany(joinProperties = {
            @JoinProperty(name = "id", referencedName = "userId")
    })
    private List<OrderGreenDao> orderGreenDaoList;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated(hash = 1822745106)
    public UserGreenDao() {
    }

    public UserGreenDao(Long id) {
        this.id = id;
    }

    @Generated(hash = 1811189815)
    public UserGreenDao(Long id, int age, double height, String name, String login, String password, String sex, String description, String phone,
            List<OrderGreenDao> rawOrders) {
        this.id = id;
        this.age = age;
        this.height = height;
        this.name = name;
        this.login = login;
        this.password = password;
        this.sex = sex;
        this.description = description;
        this.phone = phone;
        this.rawOrders = rawOrders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<OrderGreenDao> getRawOrders() {
        return rawOrders;
    }

    public void setRawOrders(List<OrderGreenDao> rawOrders) {
        this.rawOrders = rawOrders;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1191831640)
    public List<OrderGreenDao> getOrderGreenDaoList() {
        if (orderGreenDaoList == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            OrderGreenDaoDao targetDao = daoSession.getOrderGreenDaoDao();
            List<OrderGreenDao> orderGreenDaoListNew = targetDao._queryUserGreenDao_OrderGreenDaoList(id);
            synchronized (this) {
                if (orderGreenDaoList == null) {
                    orderGreenDaoList = orderGreenDaoListNew;
                }
            }
        }
        return orderGreenDaoList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 932226337)
    public synchronized void resetOrderGreenDaoList() {
        orderGreenDaoList = null;
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here
    @SuppressWarnings("unchecked")
    @Override
    @NonNull
    public List<Order> getOrders() {
        return (List<Order>) (Object) getOrderGreenDaoList();
    }


    @Override
    public void setOrders(final Collection<? extends Order> list) {
        orderGreenDaoList = (List<OrderGreenDao>) list;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 767560106)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getUserGreenDaoDao() : null;
    }

    @SuppressWarnings("unchecked")
    static class OrderSerializer implements PropertyConverter<List<OrderGreenDao>, byte[]> {
        @Override
        public List<OrderGreenDao> convertToEntityProperty(byte[] databaseValue) {
            return (List<OrderGreenDao>) Fst.INSTANCE.deserialize(databaseValue);
        }

        @Override
        public byte[] convertToDatabaseValue(List<OrderGreenDao> entityProperty) {
            return Fst.INSTANCE.serialize(entityProperty);
        }
    }

    // KEEP METHODS END

}
