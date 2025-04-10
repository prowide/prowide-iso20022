
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
 * Provides the reason for requesting a debit authorisation as well as the amount of the requested debit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitAuthorisation1", propOrder = {
    "cxlRsn",
    "amtToDbt",
    "valDtToDbt",
    "addtlCxlRsnInf"
})
public class DebitAuthorisation1 {

    @XmlElement(name = "CxlRsn", required = true)
    protected CancellationReason14Choice cxlRsn;
    @XmlElement(name = "AmtToDbt")
    protected ActiveOrHistoricCurrencyAndAmount amtToDbt;
    @XmlElement(name = "ValDtToDbt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDtToDbt;
    @XmlElement(name = "AddtlCxlRsnInf")
    protected List<String> addtlCxlRsnInf;

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason14Choice }
     *     
     */
    public CancellationReason14Choice getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason14Choice }
     *     
     */
    public DebitAuthorisation1 setCxlRsn(CancellationReason14Choice value) {
        this.cxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the amtToDbt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmtToDbt() {
        return amtToDbt;
    }

    /**
     * Sets the value of the amtToDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public DebitAuthorisation1 setAmtToDbt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amtToDbt = value;
        return this;
    }

    /**
     * Gets the value of the valDtToDbt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getValDtToDbt() {
        return valDtToDbt;
    }

    /**
     * Sets the value of the valDtToDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DebitAuthorisation1 setValDtToDbt(XMLGregorianCalendar value) {
        this.valDtToDbt = value;
        return this;
    }

    /**
     * Gets the value of the addtlCxlRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlCxlRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlCxlRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlCxlRsnInf() {
        if (addtlCxlRsnInf == null) {
            addtlCxlRsnInf = new ArrayList<String>();
        }
        return this.addtlCxlRsnInf;
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
     * Adds a new item to the addtlCxlRsnInf list.
     * @see #getAddtlCxlRsnInf()
     * 
     */
    public DebitAuthorisation1 addAddtlCxlRsnInf(String addtlCxlRsnInf) {
        getAddtlCxlRsnInf().add(addtlCxlRsnInf);
        return this;
    }

}
