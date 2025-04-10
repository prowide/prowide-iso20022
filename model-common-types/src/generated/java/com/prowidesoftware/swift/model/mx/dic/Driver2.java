
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "Driver2", propOrder = {
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
public class Driver2 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "DrvgLic")
    protected DrivingLicense2 drvgLic;
    @XmlElement(name = "Mplyr")
    protected String mplyr;
    @XmlElement(name = "MplyeeId")
    protected String mplyeeId;
    @XmlElement(name = "DeptNb")
    protected String deptNb;
    @XmlElement(name = "AddtlId")
    protected List<TravelDocument2> addtlId;
    @XmlElement(name = "DtOfBirth", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtOfBirth;
    @XmlElement(name = "AddtlData")
    protected AdditionalData1 addtlData;

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
    public Driver2 setNm(String value) {
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
    public Driver2 setId(String value) {
        this.id = value;
        return this;
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
    public Driver2 setDrvgLic(DrivingLicense2 value) {
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
    public Driver2 setMplyr(String value) {
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
    public Driver2 setMplyeeId(String value) {
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
    public Driver2 setDeptNb(String value) {
        this.deptNb = value;
        return this;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlId property.
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
     * {@link TravelDocument2 }
     * 
     * 
     * @return
     *     The value of the addtlId property.
     */
    public List<TravelDocument2> getAddtlId() {
        if (addtlId == null) {
            addtlId = new ArrayList<>();
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
    public LocalDate getDtOfBirth() {
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
    public Driver2 setDtOfBirth(LocalDate value) {
        this.dtOfBirth = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalData1 }
     *     
     */
    public AdditionalData1 getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalData1 }
     *     
     */
    public Driver2 setAddtlData(AdditionalData1 value) {
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
    public Driver2 addAddtlId(TravelDocument2 addtlId) {
        getAddtlId().add(addtlId);
        return this;
    }

}
