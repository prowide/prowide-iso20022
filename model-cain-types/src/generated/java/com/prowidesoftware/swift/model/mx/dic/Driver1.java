
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Fleet vehicle driver.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Driver1", propOrder = {
    "nm",
    "id",
    "drvgLic",
    "mplyr",
    "mplyeeId",
    "deptNb",
    "addtlId",
    "dtOfBirth",
    "addtlData"
})
public class Driver1 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "DrvgLic")
    protected DrivingLicense1 drvgLic;
    @XmlElement(name = "Mplyr")
    protected String mplyr;
    @XmlElement(name = "MplyeeId")
    protected String mplyeeId;
    @XmlElement(name = "DeptNb")
    protected String deptNb;
    @XmlElement(name = "AddtlId")
    protected List<TravelDocument1> addtlId;
    @XmlElement(name = "DtOfBirth", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfBirth;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

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
    public Driver1 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the drvgLic property.
     * 
     * @return
     *     possible object is
     *     {@link DrivingLicense1 }
     *     
     */
    public DrivingLicense1 getDrvgLic() {
        return drvgLic;
    }

    /**
     * Sets the value of the drvgLic property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrivingLicense1 }
     *     
     */
    public Driver1 setDrvgLic(DrivingLicense1 value) {
        this.drvgLic = value;
        return this;
    }

    /**
     * Gets the value of the mplyr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyr() {
        return mplyr;
    }

    /**
     * Sets the value of the mplyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver1 setMplyr(String value) {
        this.mplyr = value;
        return this;
    }

    /**
     * Gets the value of the mplyeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyeeId() {
        return mplyeeId;
    }

    /**
     * Sets the value of the mplyeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver1 setMplyeeId(String value) {
        this.mplyeeId = value;
        return this;
    }

    /**
     * Gets the value of the deptNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptNb() {
        return deptNb;
    }

    /**
     * Sets the value of the deptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver1 setDeptNb(String value) {
        this.deptNb = value;
        return this;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelDocument1 }
     * 
     * 
     */
    public List<TravelDocument1> getAddtlId() {
        if (addtlId == null) {
            addtlId = new ArrayList<TravelDocument1>();
        }
        return this.addtlId;
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
    public Driver1 setDtOfBirth(XMLGregorianCalendar value) {
        this.dtOfBirth = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Driver1 setAddtlData(String value) {
        this.addtlData = value;
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
     * Adds a new item to the addtlId list.
     * @see #getAddtlId()
     * 
     */
    public Driver1 addAddtlId(TravelDocument1 addtlId) {
        getAddtlId().add(addtlId);
        return this;
    }

}
