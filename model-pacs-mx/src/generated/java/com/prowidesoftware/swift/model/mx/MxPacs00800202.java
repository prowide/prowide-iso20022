
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for pacs.008.002.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pacs00800202"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:pacs.008.002.02")
public class MxPacs00800202
    extends AbstractMX
{

    @XmlElement(name = "pacs.008.002.02", required = true)
    protected Pacs00800202 pacs00800202;
    public final static transient String BUSINESS_PROCESS = "pacs";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification2 .class, AccountIdentification3Choice.class, AddressType2Code.class, CashAccount10 .class, CashAccount8 .class, CashClearingSystem3Code.class, ChargeBearerType2Code.class, ClearingSystemIdentification1Choice.class, CreditTransferTransactionInformation6 .class, CreditorReferenceInformation1 .class, CreditorReferenceType1 .class, CurrencyAndAmount.class, DateAndPlaceOfBirth.class, DocumentType2Code.class, DocumentType3Code.class, EuroMax15Amount.class, EuroMax9Amount.class, FinancialInstitution2 .class, FinancialInstitutionIdentification4 .class, GenericIdentification3 .class, GenericIdentification4 .class, GroupHeader19 .class, MxPacs00800202 .class, OrganisationIdentification2 .class, Pacs00800202 .class, Party2Choice.class, Party5Choice.class, PartyIdentification19 .class, PartyIdentification8 .class, PaymentIdentification2 .class, PaymentTypeInformation7 .class, PersonIdentification3 .class, PostalAddress1 .class, PostalAddress4 .class, ReferredDocumentAmount1Choice.class, ReferredDocumentInformation1 .class, ReferredDocumentType1 .class, RemittanceInformation3 .class, ServiceLevel3Code.class, ServiceLevel4 .class, SettlementInformation11 .class, SettlementMethod2Code.class, SimpleIdentificationInformation2 .class, StructuredRemittanceInformation6 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:pacs.008.002.02";

    public MxPacs00800202() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs00800202(final String xml) {
        this();
        MxPacs00800202 tmp = parse(xml);
        pacs00800202 = tmp.getPacs00800202();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs00800202(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pacs00800202 property.
     * 
     * @return
     *     possible object is
     *     {@link Pacs00800202 }
     *     
     */
    public Pacs00800202 getPacs00800202() {
        return pacs00800202;
    }

    /**
     * Sets the value of the pacs00800202 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacs00800202 }
     *     
     */
    public MxPacs00800202 setPacs00800202(Pacs00800202 value) {
        this.pacs00800202 = value;
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
    public static MxPacs00800202 parse(String xml) {
        return ((MxPacs00800202) MxReadImpl.parse(MxPacs00800202 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs00800202 parse(String xml, MxRead parserImpl) {
        return ((MxPacs00800202) parserImpl.read(MxPacs00800202 .class, xml, _classes));
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
     * Creates an MxPacs00800202 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs00800202 message
     * @return
     *     a new instance of MxPacs00800202
     */
    public final static MxPacs00800202 fromJson(String json) {
        return AbstractMX.fromJson(json, MxPacs00800202 .class);
    }

}
