
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies metadata attributes for regulatory data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataReport5", propOrder = {
    "submitgNtty",
    "colltnBody",
    "rltdNtty",
    "rltdPdctIdr",
    "rgltryDataTp",
    "rgltryData"
})
public class MetadataReport5 {

    @XmlElement(name = "SubmitgNtty")
    protected PartyIdentification260Choice submitgNtty;
    @XmlElement(name = "ColltnBody")
    protected GenericIdentification175 colltnBody;
    @XmlElement(name = "RltdNtty")
    protected List<PartyIdentification260Choice> rltdNtty;
    @XmlElement(name = "RltdPdctIdr")
    protected List<SecurityIdentification49> rltdPdctIdr;
    @XmlElement(name = "RgltryDataTp")
    protected List<ClassificationType4> rgltryDataTp;
    @XmlElement(name = "RgltryData", required = true)
    protected List<Document28> rgltryData;

    /**
     * Gets the value of the submitgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification260Choice }
     *     
     */
    public PartyIdentification260Choice getSubmitgNtty() {
        return submitgNtty;
    }

    /**
     * Sets the value of the submitgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification260Choice }
     *     
     */
    public MetadataReport5 setSubmitgNtty(PartyIdentification260Choice value) {
        this.submitgNtty = value;
        return this;
    }

    /**
     * Gets the value of the colltnBody property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification175 }
     *     
     */
    public GenericIdentification175 getColltnBody() {
        return colltnBody;
    }

    /**
     * Sets the value of the colltnBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification175 }
     *     
     */
    public MetadataReport5 setColltnBody(GenericIdentification175 value) {
        this.colltnBody = value;
        return this;
    }

    /**
     * Gets the value of the rltdNtty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdNtty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdNtty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification260Choice }
     * 
     * 
     * @return
     *     The value of the rltdNtty property.
     */
    public List<PartyIdentification260Choice> getRltdNtty() {
        if (rltdNtty == null) {
            rltdNtty = new ArrayList<>();
        }
        return this.rltdNtty;
    }

    /**
     * Gets the value of the rltdPdctIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdPdctIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdPdctIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification49 }
     * 
     * 
     * @return
     *     The value of the rltdPdctIdr property.
     */
    public List<SecurityIdentification49> getRltdPdctIdr() {
        if (rltdPdctIdr == null) {
            rltdPdctIdr = new ArrayList<>();
        }
        return this.rltdPdctIdr;
    }

    /**
     * Gets the value of the rgltryDataTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rgltryDataTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRgltryDataTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationType4 }
     * 
     * 
     * @return
     *     The value of the rgltryDataTp property.
     */
    public List<ClassificationType4> getRgltryDataTp() {
        if (rgltryDataTp == null) {
            rgltryDataTp = new ArrayList<>();
        }
        return this.rgltryDataTp;
    }

    /**
     * Gets the value of the rgltryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rgltryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRgltryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document28 }
     * 
     * 
     * @return
     *     The value of the rgltryData property.
     */
    public List<Document28> getRgltryData() {
        if (rgltryData == null) {
            rgltryData = new ArrayList<>();
        }
        return this.rgltryData;
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
     * Adds a new item to the rltdNtty list.
     * @see #getRltdNtty()
     * 
     */
    public MetadataReport5 addRltdNtty(PartyIdentification260Choice rltdNtty) {
        getRltdNtty().add(rltdNtty);
        return this;
    }

    /**
     * Adds a new item to the rltdPdctIdr list.
     * @see #getRltdPdctIdr()
     * 
     */
    public MetadataReport5 addRltdPdctIdr(SecurityIdentification49 rltdPdctIdr) {
        getRltdPdctIdr().add(rltdPdctIdr);
        return this;
    }

    /**
     * Adds a new item to the rgltryDataTp list.
     * @see #getRgltryDataTp()
     * 
     */
    public MetadataReport5 addRgltryDataTp(ClassificationType4 rgltryDataTp) {
        getRgltryDataTp().add(rgltryDataTp);
        return this;
    }

    /**
     * Adds a new item to the rgltryData list.
     * @see #getRgltryData()
     * 
     */
    public MetadataReport5 addRgltryData(Document28 rgltryData) {
        getRgltryData().add(rgltryData);
        return this;
    }

}
