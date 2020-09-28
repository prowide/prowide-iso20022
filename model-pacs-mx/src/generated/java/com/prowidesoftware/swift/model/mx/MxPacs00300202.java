
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
 * Class for pacs.003.002.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pacs00300202"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:pacs.003.002.02")
public class MxPacs00300202
    extends AbstractMX
{

    @XmlElement(name = "pacs.003.002.02", required = true)
    protected Pacs00300202 pacs00300202;
    public final static transient String BUSINESS_PROCESS = "pacs";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification2 .class, AccountIdentification3Choice.class, AddressType2Code.class, AmendmentInformationDetails4 .class, CashAccount10 .class, CashAccount8 .class, CashClearingSystem3Code.class, ChargeBearerType2Code.class, ClearingSystemIdentification1Choice.class, CreditorReferenceInformation1 .class, CreditorReferenceType1 .class, CurrencyAndAmount.class, DateAndPlaceOfBirth.class, DirectDebitTransaction4 .class, DirectDebitTransactionInformation5 .class, DocumentType2Code.class, DocumentType3Code.class, EuroMax15Amount.class, EuroMax9Amount.class, FinancialInstitution2 .class, FinancialInstitution3 .class, FinancialInstitutionIdentification4 .class, FinancialInstitutionIdentification5 .class, GenericIdentification3 .class, GenericIdentification4 .class, GroupHeader20 .class, MandateRelatedInformation4 .class, MxPacs00300202 .class, OrganisationIdentification2 .class, Pacs00300202 .class, Party2Choice.class, Party5Choice.class, PartyIdentification11 .class, PartyIdentification12 .class, PartyIdentification13 .class, PartyIdentification17 .class, PartyIdentification19 .class, PartyIdentification8 .class, PartyPrivate1 .class, PaymentIdentification2 .class, PaymentTypeInformation8 .class, PersonIdentification3 .class, PersonIdentification4 .class, PostalAddress1 .class, PostalAddress4 .class, ReferredDocumentAmount1Choice.class, ReferredDocumentInformation1 .class, ReferredDocumentType1 .class, RemittanceInformation3 .class, RestrictedIdentification1 .class, RestrictedIdentification2 .class, SequenceType1Code.class, ServiceLevel3Code.class, ServiceLevel5 .class, SettlementInformation12 .class, SettlementMethod2Code.class, SimpleIdentificationInformation2 .class, StructuredRemittanceInformation6 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:pacs.003.002.02";

    public MxPacs00300202() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs00300202(final String xml) {
        this();
        MxPacs00300202 tmp = parse(xml);
        pacs00300202 = tmp.getPacs00300202();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs00300202(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pacs00300202 property.
     * 
     * @return
     *     possible object is
     *     {@link Pacs00300202 }
     *     
     */
    public Pacs00300202 getPacs00300202() {
        return pacs00300202;
    }

    /**
     * Sets the value of the pacs00300202 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacs00300202 }
     *     
     */
    public MxPacs00300202 setPacs00300202(Pacs00300202 value) {
        this.pacs00300202 = value;
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
    public static MxPacs00300202 parse(String xml) {
        return ((MxPacs00300202) MxReadImpl.parse(MxPacs00300202 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs00300202 parse(String xml, MxRead parserImpl) {
        return ((MxPacs00300202) parserImpl.read(MxPacs00300202 .class, xml, _classes));
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
     * Creates an MxPacs00300202 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs00300202 message
     * @return
     *     a new instance of MxPacs00300202
     */
    public final static MxPacs00300202 fromJson(String json) {
        return AbstractMX.fromJson(json, MxPacs00300202 .class);
    }

}
