
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for tsin.003.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "invcFincgCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.003.001.01")
public class MxTsin00300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "InvcFincgCxlReq", required = true)
    protected InvoiceFinancingCancellationRequestV01 invcFincgCxlReq;
    public final static transient String BUSINESS_PROCESS = "tsin";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, ActiveCurrencyAndAmount.class, CancellationRequestInformation1 .class, CashAccount7 .class, CashAccountType2 .class, CashAccountType4Code.class, ClearingSystemMemberIdentification2Choice.class, FinancialInstitutionIdentification6 .class, GenericIdentification4 .class, InvoiceFinancingCancellationRequestV01 .class, MessageIdentification1 .class, MxTsin00300101 .class, PartyIdentification25 .class, PartyIdentificationAndAccount6 .class, SimpleIdentificationInformation2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsin.003.001.01";

    public MxTsin00300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsin00300101(final String xml) {
        this();
        MxTsin00300101 tmp = parse(xml);
        invcFincgCxlReq = tmp.getInvcFincgCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsin00300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the invcFincgCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceFinancingCancellationRequestV01 }
     *     
     */
    public InvoiceFinancingCancellationRequestV01 getInvcFincgCxlReq() {
        return invcFincgCxlReq;
    }

    /**
     * Sets the value of the invcFincgCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceFinancingCancellationRequestV01 }
     *     
     */
    public MxTsin00300101 setInvcFincgCxlReq(InvoiceFinancingCancellationRequestV01 value) {
        this.invcFincgCxlReq = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxTsin00300101 parse(String xml) {
        return ((MxTsin00300101) MxReadImpl.parse(MxTsin00300101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsin00300101 parse(String xml, MxRead parserImpl) {
        return ((MxTsin00300101) parserImpl.read(MxTsin00300101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxTsin00300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsin00300101 message
     * @return
     *     a new instance of MxTsin00300101
     */
    public final static MxTsin00300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsin00300101 .class);
    }

}
