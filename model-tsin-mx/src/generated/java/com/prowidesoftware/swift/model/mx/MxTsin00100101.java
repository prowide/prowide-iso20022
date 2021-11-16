
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
 * Class for tsin.001.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "invcFincgReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01")
public class MxTsin00100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "InvcFincgReq", required = true)
    protected InvoiceFinancingRequestV01 invcFincgReq;
    public final static transient String BUSINESS_PROCESS = "tsin";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, ActiveCurrencyAndAmount.class, AdditionalInformation1 .class, AddressType2Code.class, Adjustment5 .class, AdjustmentDirection1Code.class, AgreementClauses1 .class, CashAccount7 .class, CashAccountType2 .class, CashAccountType4Code.class, ClearingSystemMemberIdentification2Choice.class, ContactIdentification1 .class, DateAndPlaceOfBirth.class, DocumentGeneralInformation1 .class, DocumentType2Code.class, DocumentType4Code.class, FinancialInstitutionIdentification6 .class, FinancingRateOrAmountChoice.class, GenericIdentification3 .class, GenericIdentification4 .class, InformationType1Choice.class, InformationType1Code.class, Instalment1 .class, InvoiceFinancingRequestV01 .class, InvoiceRequestInformation1 .class, InvoiceTotals1 .class, MxTsin00100101 .class, NamePrefix1Code.class, OrganisationIdentification2 .class, Party2Choice.class, PartyAndAccountIdentificationAndContactInformation1 .class, PartyIdentification25 .class, PartyIdentification8 .class, PartyIdentificationAndAccount6 .class, PartyIdentificationAndContactInformation1 .class, PaymentInformation15 .class, PaymentMethod4Code.class, PersonIdentification3 .class, PostalAddress1 .class, ReferredDocumentInformation2 .class, ReferredDocumentType1 .class, RequestGroupInformation1 .class, SimpleIdentificationInformation2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01";

    public MxTsin00100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsin00100101(final String xml) {
        this();
        MxTsin00100101 tmp = parse(xml);
        invcFincgReq = tmp.getInvcFincgReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsin00100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the invcFincgReq property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceFinancingRequestV01 }
     *     
     */
    public InvoiceFinancingRequestV01 getInvcFincgReq() {
        return invcFincgReq;
    }

    /**
     * Sets the value of the invcFincgReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceFinancingRequestV01 }
     *     
     */
    public MxTsin00100101 setInvcFincgReq(InvoiceFinancingRequestV01 value) {
        this.invcFincgReq = value;
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
    public static MxTsin00100101 parse(String xml) {
        return ((MxTsin00100101) MxReadImpl.parse(MxTsin00100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsin00100101 parse(String xml, MxRead parserImpl) {
        return ((MxTsin00100101) parserImpl.read(MxTsin00100101 .class, xml, _classes));
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
     * Creates an MxTsin00100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsin00100101 message
     * @return
     *     a new instance of MxTsin00100101
     */
    public final static MxTsin00100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsin00100101 .class);
    }

}
