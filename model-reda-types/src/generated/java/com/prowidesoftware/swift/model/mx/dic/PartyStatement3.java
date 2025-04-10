
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
 * Provides system date for all of the changes occurred for an entity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyStatement3", propOrder = {
    "sysDt",
    "chng"
})
public class PartyStatement3 {

    @XmlElement(name = "SysDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate sysDt;
    @XmlElement(name = "Chng")
    protected List<PartyReferenceDataChange3> chng;

    /**
     * Gets the value of the sysDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getSysDt() {
        return sysDt;
    }

    /**
     * Sets the value of the sysDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyStatement3 setSysDt(LocalDate value) {
        this.sysDt = value;
        return this;
    }

    /**
     * Gets the value of the chng property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chng property.
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
     * {@link PartyReferenceDataChange3 }
     * 
     * 
     * @return
     *     The value of the chng property.
     */
    public List<PartyReferenceDataChange3> getChng() {
        if (chng == null) {
            chng = new ArrayList<>();
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
    public PartyStatement3 addChng(PartyReferenceDataChange3 chng) {
        getChng().add(chng);
        return this;
    }

}
