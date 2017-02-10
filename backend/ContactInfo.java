package backend;

import DB_controllers.DataBaseController;
import testing.myLogger;
import java.sql.SQLException;

/**
 * Class contact info.
 * Has information about the contact to localize it.
 * @author rguimerao
 *
 */
public class ContactInfo extends Identifier {

	private String name;
	private String description;
	private String street;
	private int areaCode;
	private String city;
	private String country;
	private int phone;
	private String email;

	/**
	 * Constructor of contact info
	 * @param name Name of the contact
	 * @param description Description of the contact
	 * @param street Street where the contact lives
	 * @param postalCode Postal code of the street
	 * @param city City of the contact
	 * @param country Country of the contact
	 * @param phoneNumber Phone number of the contact
	 * @param email Email of the contact
	 */
	public ContactInfo(
		final String name,
		final String description,
		final String street,
		final int areaCode,
		final String city,
		final String country,
		final int phone,
		final String email) {

		super();
		this.name        = name;
		this.description = description;
		this.street      = street;
		this.areaCode    = areaCode;
		this.city        = city;
		this.country     = country;
		this.phone       = phone;
		this.email       = email;
		myLogger.getInstance().info("A new contact info has been created");
	}
	
	/**
	 * Obtains the ID from the DB
	 */
	@Override
	public void obtainID() {
	    myLogger.getInstance().info("obtainID in ContactInfo");
		try {
            setID(DataBaseController.getInstance().obtainID(this));
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	/**
	 * Getter of name
	 * @return name of the contact
	 */
	public final String getName() {
	    myLogger.getInstance().info("Name of contact info has been getted");
		return this.name;
	}

	/**
	 * Setter of name
	 * @param newName new name the contact will have
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public final void setName(final String newName) 
	        throws SQLException {
		this.name = newName;
		myLogger.getInstance().info("Name of contact info has been setted");
		DataBaseController.getInstance().updateNameContactInfo(getID(), newName);
	}

	/**
	 * Getter of description
	 * @return description of the contact
	 */
	public final String getDescription() {
	    myLogger.getInstance().info("Description of contact info has been getted");
		return this.description;
	}

	/**
	 * Setter of description
	 * @param newDescription new description the contact will have
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public final void setDescription(final String newDescription) 
	        throws SQLException {
		this.description = newDescription;
		myLogger.getInstance().info("Description of contact info has been setted");
		DataBaseController.getInstance().updateDescriptionContactInfo(getID(), newDescription);
	}

	/**
	 * Getter of street
	 * @return street of the contact
	 */
	public final String getStreet() {
	    myLogger.getInstance().info("Street of contact info has been getted");
		return this.street;
	}

	/**
	 * Setter of street
	 * @param newStreet new street the contact will have
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public final void setStreet(final String newStreet) 
	        throws SQLException {
		this.street = newStreet;
		myLogger.getInstance().info("Street of contact info has been setted");
		DataBaseController.getInstance().updateStreetContactInfo(getID(), newStreet);
	}

	/**
	 * Getter of postal code
	 * @return postal code of the contact
	 */
	public final int getAreaCode() {
	    myLogger.getInstance().info("Postal code of contact info has been getted");
		return this.areaCode;
	}

	/**
	 * Setter of postal code
	 * @param newPostalCode new postal code the contact will have
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public final void setAreaCode(final int newAreaCode) 
	        throws SQLException {
		this.areaCode = newAreaCode;
		myLogger.getInstance().info("Postal code of contact info has been setted");
		DataBaseController.getInstance().updateAreaCodeContactInfo(getID(), newAreaCode);
	}

	/**
	 * Getter of city
	 * @return city of the contact
	 */
	public final String getCity() {
	    myLogger.getInstance().info("City of contact info has been getted");
		return this.city;
	}

	/**
	 * Setter of city
	 * @param newCity new city the contact will have
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public final void setCity(final String newCity) 
	        throws SQLException {
		this.city = newCity;
		myLogger.getInstance().info("City of contact info has been setted");
		DataBaseController.getInstance().updateCityContactInfo(getID(), newCity);
	}

	/**
	 * Getter of country
	 * @return country of the contact
	 */
	public final String getCountry() {
	    myLogger.getInstance().info("Country of contact info has been getted");
		return this.country;
	}

	/**
	 * Setter of country
	 * @param newCountry new country of the contact
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public final void setCountry(final String newCountry) 
	        throws SQLException {
		this.city = newCountry;
		myLogger.getInstance().info("Country of contact info has been setted");
		DataBaseController.getInstance().updateCountryContactInfo(getID(), newCountry);
	}

	/**
	 * Getter of phone number
	 * @return phone number of the contact
	 */
	public final int getPhone() {
	    myLogger.getInstance().info("Phone number of contact info has been getted");
		return this.phone;
	}

	/**
	 * Setter of phone number
	 * @param newPhoneNumber new phone number the contact will have
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public final void setPhone(final int newPhone) 
	        throws SQLException {
		this.phone = newPhone;
		myLogger.getInstance().info("Phone number of contact info has been setted");
		DataBaseController.getInstance().updatePhoneContactInfo(getID(), newPhone);
	}

	/**
	 * Getter of email
	 * @return email of the contact
	 */
	public final String getEmail() {
	    myLogger.getInstance().info("Email of contact info has been getted");
		return this.email;
	}

	/**
	 * Setter of email
	 * @param newEmail new email the contact will have
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public final void setEmail(final String newEmail)
	        throws SQLException {
		this.email = newEmail;
		myLogger.getInstance().info("Email of contact info has been setted");
		DataBaseController.getInstance().updateEmailContactInfo(getID(), newEmail);
	}

}
