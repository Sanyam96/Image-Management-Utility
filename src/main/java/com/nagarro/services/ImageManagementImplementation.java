package com.nagarro.services;

import com.nagarro.interfaces.ImageManagementInterface;
import com.nagarro.models.Image;
import com.nagarro.utils.HibernateUtilities;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * @author Sanyam Goel created on 4/9/18
 */
public class ImageManagementImplementation implements ImageManagementInterface {

    /*
     * add an image to database corresponding to a given user
     * @see com.nagarro.dao.api.ImageManagementInterface#addImage(com.nagarro.models.Image)
     */
    @Override
    public void addImage(Image image) {
        try (Session session = HibernateUtilities.getSessionInstance();) {
            session.getTransaction().begin();
            session.save(image);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * get an image from database
     * @see com.nagarro.dao.api.ImageManagementInterface#getImage(java.lang.String)
     */
    @Override
    public Image getImage(String imageId) {
        Image image = null;
        try (Session session = HibernateUtilities.getSessionInstance();) {
            session.getTransaction().begin();
            //image = (Image) session.get("Image.class", Long.parseLong(imageId));
            //session.getTransaction().commit();
            //session.close();
            String queryString = "from Image where imageId = :imageId";
            Query query = session.createQuery(queryString).setString("imageId", imageId);

            Object queryResult = query.uniqueResult();
            return (Image) queryResult;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Unable to connect to database");
        }
        return image;
    }

    /*
     * method to edit an image
     * @see com.nagarro.dao.api.ImageManagementInterface#editImage(com.nagarro.models.Image)
     */
    @Override
    public void editImage(Image newImage) {
        try (Session session = HibernateUtilities.getSessionInstance();) {
            session.beginTransaction();
            session.update(newImage);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * method to delete an image present in database using HQL
     * @see com.nagarro.dao.api.ImageManagementInterface#deleteImage(java.lang.String)
     */
    @Override
    public void deleteImage(String imageid) {
        try (Session session = HibernateUtilities.getSessionInstance();) {
            session.beginTransaction();

            String query = "delete from Image where imageId= :imageId";
            session.createQuery(query).setString("imageId", imageid).executeUpdate();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
