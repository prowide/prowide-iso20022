
package com.prowidesoftware.swift.model.mx.dic;

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
 * Provides additional information regarding corporate action option details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOptionSD5", propOrder = {
    "plcAndNm",
    "optnSts",
    "randLotPrefFlg",
    "newShrDsptchdDt"
})
public class CorporateActionOptionSD5 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "OptnSts")
    @XmlSchemaType(name = "string")
    protected WorkflowStatus1Code optnSts;
    @XmlElement(name = "RandLotPrefFlg")
    protected Boolean randLotPrefFlg;
    @XmlElement(name = "NewShrDsptchdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar newShrDsptchdDt;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionOptionSD5 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the optnSts property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowStatus1Code }
     *     
     */
    public WorkflowStatus1Code getOptnSts() {
        return optnSts;
    }

    /**
     * Sets the value of the optnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowStatus1Code }
     *     
     */
    public CorporateActionOptionSD5 setOptnSts(WorkflowStatus1Code value) {
        this.optnSts = value;
        return this;
    }

    /**
     * Gets the value of the randLotPrefFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRandLotPrefFlg() {
        return randLotPrefFlg;
    }

    /**
     * Sets the value of the randLotPrefFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionOptionSD5 setRandLotPrefFlg(Boolean value) {
        this.randLotPrefFlg = value;
        return this;
    }

    /**
     * Gets the value of the newShrDsptchdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getNewShrDsptchdDt() {
        return newShrDsptchdDt;
    }

    /**
     * Sets the value of the newShrDsptchdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionOptionSD5 setNewShrDsptchdDt(XMLGregorianCalendar value) {
        this.newShrDsptchdDt = value;
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

}
