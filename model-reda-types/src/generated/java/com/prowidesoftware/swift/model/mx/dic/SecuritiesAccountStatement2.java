
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides system date for all of the changes occurred for an entity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountStatement2", propOrder = {
    "sysDt",
    "chng"
})
public class SecuritiesAccountStatement2 {

    @XmlElement(name = "SysDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sysDt;
    @XmlElement(name = "Chng")
    protected List<SecuritiesAccountReferenceDataChange2> chng;

    /**
     * Gets the value of the sysDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSysDt() {
        return sysDt;
    }

    /**
     * Sets the value of the sysDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SecuritiesAccountStatement2 setSysDt(XMLGregorianCalendar value) {
        this.sysDt = value;
        return this;
    }

    /**
     * Gets the value of the chng property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chng property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChng().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesAccountReferenceDataChange2 }
     * 
     * 
     */
    public List<SecuritiesAccountReferenceDataChange2> getChng() {
        if (chng == null) {
            chng = new ArrayList<SecuritiesAccountReferenceDataChange2>();
        }
        return this.chng;
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
     * Adds a new item to the chng list.
     * @see #getChng()
     * 
     */
    public SecuritiesAccountStatement2 addChng(SecuritiesAccountReferenceDataChange2 chng) {
        getChng().add(chng);
        return this;
    }

}
