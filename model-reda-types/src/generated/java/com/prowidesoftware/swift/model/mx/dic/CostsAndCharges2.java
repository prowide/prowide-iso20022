
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
 * Costs and charges associated with the distribution or selling of a financial instrument. These may be one-off or recurring charges. These may be intended (ex ante) or actual (ex post).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostsAndCharges2", propOrder = {
    "exAnteRefDt",
    "indvCostOrChrg",
    "addtlInf"
})
public class CostsAndCharges2 {

    @XmlElement(name = "ExAnteRefDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exAnteRefDt;
    @XmlElement(name = "IndvCostOrChrg", required = true)
    protected List<IndividualCostOrCharge2> indvCostOrChrg;
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
    public CostsAndCharges2 setExAnteRefDt(XMLGregorianCalendar value) {
        this.exAnteRefDt = value;
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
     * {@link IndividualCostOrCharge2 }
     * 
     * 
     */
    public List<IndividualCostOrCharge2> getIndvCostOrChrg() {
        if (indvCostOrChrg == null) {
            indvCostOrChrg = new ArrayList<IndividualCostOrCharge2>();
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
    public CostsAndCharges2 setAddtlInf(AdditionalInformation15 value) {
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
    public CostsAndCharges2 addIndvCostOrChrg(IndividualCostOrCharge2 indvCostOrChrg) {
        getIndvCostOrChrg().add(indvCostOrChrg);
        return this;
    }

}
