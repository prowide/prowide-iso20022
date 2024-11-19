
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Information related to the request of maintenance delegations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceDelegationResponse8", propOrder = {
    "tmId",
    "mstrTMId",
    "tmDtTm",
    "tmChllngVal",
    "dlgtnRspn"
})
public class MaintenanceDelegationResponse8 {

    @XmlElement(name = "TMId", required = true)
    protected GenericIdentification176 tmId;
    @XmlElement(name = "MstrTMId")
    protected GenericIdentification176 mstrTMId;
    @XmlElement(name = "TMDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime tmDtTm;
    @XmlElement(name = "TMChllngVal", required = true)
    protected byte[] tmChllngVal;
    @XmlElement(name = "DlgtnRspn", required = true)
    protected List<MaintenanceDelegation17> dlgtnRspn;

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
    public MaintenanceDelegationResponse8 setTMId(GenericIdentification176 value) {
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
    public MaintenanceDelegationResponse8 setMstrTMId(GenericIdentification176 value) {
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
    public OffsetDateTime getTMDtTm() {
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
    public MaintenanceDelegationResponse8 setTMDtTm(OffsetDateTime value) {
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
    public MaintenanceDelegationResponse8 setTMChllngVal(byte[] value) {
        this.tmChllngVal = value;
        return this;
    }

    /**
     * Gets the value of the dlgtnRspn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dlgtnRspn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlgtnRspn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceDelegation17 }
     * 
     * 
     * @return
     *     The value of the dlgtnRspn property.
     */
    public List<MaintenanceDelegation17> getDlgtnRspn() {
        if (dlgtnRspn == null) {
            dlgtnRspn = new ArrayList<>();
        }
        return this.dlgtnRspn;
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
     * Adds a new item to the dlgtnRspn list.
     * @see #getDlgtnRspn()
     * 
     */
    public MaintenanceDelegationResponse8 addDlgtnRspn(MaintenanceDelegation17 dlgtnRspn) {
        getDlgtnRspn().add(dlgtnRspn);
        return this;
    }

}
