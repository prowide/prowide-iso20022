
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
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related to the request of maintenance delegations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceDelegationRequest9", propOrder = {
    "tmId",
    "mstrTMId",
    "tmDtTm",
    "tmChllngVal",
    "reqdDlgtn"
})
public class MaintenanceDelegationRequest9 {

    @XmlElement(name = "TMId", required = true)
    protected GenericIdentification176 tmId;
    @XmlElement(name = "MstrTMId")
    protected GenericIdentification176 mstrTMId;
    @XmlElement(name = "TMDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmDtTm;
    @XmlElement(name = "TMChllngVal", required = true)
    protected byte[] tmChllngVal;
    @XmlElement(name = "ReqdDlgtn", required = true)
    protected List<MaintenanceDelegation15> reqdDlgtn;

    /**
     * Gets the value of the tmId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getTMId() {
        return tmId;
    }

    /**
     * Sets the value of the tmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public MaintenanceDelegationRequest9 setTMId(GenericIdentification176 value) {
        this.tmId = value;
        return this;
    }

    /**
     * Gets the value of the mstrTMId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getMstrTMId() {
        return mstrTMId;
    }

    /**
     * Sets the value of the mstrTMId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public MaintenanceDelegationRequest9 setMstrTMId(GenericIdentification176 value) {
        this.mstrTMId = value;
        return this;
    }

    /**
     * Gets the value of the tmDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTMDtTm() {
        return tmDtTm;
    }

    /**
     * Sets the value of the tmDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MaintenanceDelegationRequest9 setTMDtTm(XMLGregorianCalendar value) {
        this.tmDtTm = value;
        return this;
    }

    /**
     * Gets the value of the tmChllngVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTMChllngVal() {
        return tmChllngVal;
    }

    /**
     * Sets the value of the tmChllngVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public MaintenanceDelegationRequest9 setTMChllngVal(byte[] value) {
        this.tmChllngVal = value;
        return this;
    }

    /**
     * Gets the value of the reqdDlgtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reqdDlgtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqdDlgtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceDelegation15 }
     * 
     * 
     */
    public List<MaintenanceDelegation15> getReqdDlgtn() {
        if (reqdDlgtn == null) {
            reqdDlgtn = new ArrayList<MaintenanceDelegation15>();
        }
        return this.reqdDlgtn;
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
     * Adds a new item to the reqdDlgtn list.
     * @see #getReqdDlgtn()
     * 
     */
    public MaintenanceDelegationRequest9 addReqdDlgtn(MaintenanceDelegation15 reqdDlgtn) {
        getReqdDlgtn().add(reqdDlgtn);
        return this;
    }

}
