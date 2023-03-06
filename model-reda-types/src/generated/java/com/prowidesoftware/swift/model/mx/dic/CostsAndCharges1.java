
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
 * Costs and charges associated with the distribution or selling of a financial instrument. These may be one-off or recurring charges. These may be intended (ex ante) or actual (ex post).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostsAndCharges1", propOrder = {
    "exAnteRefDt",
    "exPstRefDt",
    "indvCostOrChrg",
    "addtlInf"
})
public class CostsAndCharges1 {

    @XmlElement(name = "ExAnteRefDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exAnteRefDt;
    @XmlElement(name = "ExPstRefDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exPstRefDt;
    @XmlElement(name = "IndvCostOrChrg", required = true)
    protected List<IndividualCostOrCharge1> indvCostOrChrg;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation15 addtlInf;

    /**
     * Gets the value of the exAnteRefDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getExAnteRefDt() {
        return exAnteRefDt;
    }

    /**
     * Sets the value of the exAnteRefDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CostsAndCharges1 setExAnteRefDt(XMLGregorianCalendar value) {
        this.exAnteRefDt = value;
        return this;
    }

    /**
     * Gets the value of the exPstRefDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getExPstRefDt() {
        return exPstRefDt;
    }

    /**
     * Sets the value of the exPstRefDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CostsAndCharges1 setExPstRefDt(XMLGregorianCalendar value) {
        this.exPstRefDt = value;
        return this;
    }

    /**
     * Gets the value of the indvCostOrChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indvCostOrChrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvCostOrChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualCostOrCharge1 }
     * 
     * 
     */
    public List<IndividualCostOrCharge1> getIndvCostOrChrg() {
        if (indvCostOrChrg == null) {
            indvCostOrChrg = new ArrayList<IndividualCostOrCharge1>();
        }
        return this.indvCostOrChrg;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public AdditionalInformation15 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public CostsAndCharges1 setAddtlInf(AdditionalInformation15 value) {
        this.addtlInf = value;
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
     * Adds a new item to the indvCostOrChrg list.
     * @see #getIndvCostOrChrg()
     * 
     */
    public CostsAndCharges1 addIndvCostOrChrg(IndividualCostOrCharge1 indvCostOrChrg) {
        getIndvCostOrChrg().add(indvCostOrChrg);
        return this;
    }

}
