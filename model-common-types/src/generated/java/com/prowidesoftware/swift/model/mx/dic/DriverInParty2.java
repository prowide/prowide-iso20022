
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Driver in a car rental party
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverInParty2", propOrder = {
    "nm",
    "adr",
    "ctct",
    "dtOfBirth",
    "age",
    "drvrCrdntl",
    "drvgLic"
})
public class DriverInParty2 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "Ctct")
    protected Contact6 ctct;
    @XmlElement(name = "DtOfBirth", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfBirth;
    @XmlElement(name = "Age")
    protected String age;
    @XmlElement(name = "DrvrCrdntl")
    protected List<TravelDocument2> drvrCrdntl;
    @XmlElement(name = "DrvgLic")
    protected DrivingLicense2 drvgLic;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DriverInParty2 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public DriverInParty2 setAdr(Address2 value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the ctct property.
     * 
     * @return
     *     possible object is
     *     {@link Contact6 }
     *     
     */
    public Contact6 getCtct() {
        return ctct;
    }

    /**
     * Sets the value of the ctct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact6 }
     *     
     */
    public DriverInParty2 setCtct(Contact6 value) {
        this.ctct = value;
        return this;
    }

    /**
     * Gets the value of the dtOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDtOfBirth() {
        return dtOfBirth;
    }

    /**
     * Sets the value of the dtOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DriverInParty2 setDtOfBirth(XMLGregorianCalendar value) {
        this.dtOfBirth = value;
        return this;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DriverInParty2 setAge(String value) {
        this.age = value;
        return this;
    }

    /**
     * Gets the value of the drvrCrdntl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drvrCrdntl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrvrCrdntl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelDocument2 }
     * 
     * 
     */
    public List<TravelDocument2> getDrvrCrdntl() {
        if (drvrCrdntl == null) {
            drvrCrdntl = new ArrayList<TravelDocument2>();
        }
        return this.drvrCrdntl;
    }

    /**
     * Gets the value of the drvgLic property.
     * 
     * @return
     *     possible object is
     *     {@link DrivingLicense2 }
     *     
     */
    public DrivingLicense2 getDrvgLic() {
        return drvgLic;
    }

    /**
     * Sets the value of the drvgLic property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrivingLicense2 }
     *     
     */
    public DriverInParty2 setDrvgLic(DrivingLicense2 value) {
        this.drvgLic = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the drvrCrdntl list.
     * @see #getDrvrCrdntl()
     * 
     */
    public DriverInParty2 addDrvrCrdntl(TravelDocument2 drvrCrdntl) {
        getDrvrCrdntl().add(drvrCrdntl);
        return this;
    }

}
