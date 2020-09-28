
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
 * Class for pacs.007.003.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pacs00700302"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:pacs.007.003.02")
public class MxPacs00700302
    extends AbstractMX
{

    @XmlElement(name = "pacs.007.003.02", required = true)
    protected Pacs00700302 pacs00700302;
    public final static transient String BUSINESS_PROCESS = "pacs";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 3;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification2 .class, AccountIdentification3Choice.class, AddressType2Code.class, AmendmentInformationDetails5 .class, AmountType2Choice.class, CashAccount7 .class, CashAccount8 .class, CashAccountType2 .class, CashAccountType4Code.class, CashClearingSystem3Code.class, ChargeBearerType2Code.class, ChargesInformation2 .class, ClearingChannel2Code.class, ClearingSystemIdentification1Choice.class, CreditorReferenceInformation1 .class, CreditorReferenceType1 .class, CurrencyAndAmount.class, DateAndPlaceOfBirth.class, DocumentType2Code.class, DocumentType3Code.class, EquivalentAmount.class, EuroMax15Amount.class, EuroMax9Amount.class, FinancialInstitution2 .class, FinancialInstitution3 .class, FinancialInstitutionIdentification4 .class, FinancialInstitutionIdentification5 .class, Frequency1Code.class, GenericIdentification3 .class, GenericIdentification4 .class, GroupHeader18 .class, LocalInstrument1Choice.class, MandateRelatedInformation5 .class, MxPacs00700302 .class, OrganisationIdentification2 .class, OrganisationIdentification3 .class, OriginalGroupInformation16 .class, OriginalTransactionReference9 .class, Pacs00700302 .class, Party2Choice.class, Party5Choice.class, PartyIdentification14 .class, PartyIdentification18 .class, PartyIdentification20 .class, PartyIdentification8 .class, PartyOrganisation1Choice.class, PartyPrivate1 .class, PaymentCategoryPurpose1Code.class, PaymentMethod4Code.class, PaymentTransactionInformation17 .class, PaymentTypeInformation12 .class, PersonIdentification3 .class, PersonIdentification4 .class, PostalAddress1 .class, PostalAddress4 .class, Priority2Code.class, ReferredDocumentAmount1Choice.class, ReferredDocumentInformation1 .class, ReferredDocumentType1 .class, RemittanceInformation4 .class, RestrictedIdentification1 .class, RestrictedIdentification2 .class, ReversalReason1Choice.class, ReversalReasonInformation5 .class, SequenceType1Code.class, ServiceLevel3Code.class, ServiceLevel6Choice.class, SettlementInformation6 .class, SettlementInformation8 .class, SettlementMethod1Code.class, SimpleIdentificationInformation2 .class, StructuredRemittanceInformation6 .class, TransactionReversalReason1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:pacs.007.003.02";

    public MxPacs00700302() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs00700302(final String xml) {
        this();
        MxPacs00700302 tmp = parse(xml);
        pacs00700302 = tmp.getPacs00700302();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs00700302(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pacs00700302 property.
     * 
     * @return
     *     possible object is
     *     {@link Pacs00700302 }
     *     
     */
    public Pacs00700302 getPacs00700302() {
        return pacs00700302;
    }

    /**
     * Sets the value of the pacs00700302 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacs00700302 }
     *     
     */
    public MxPacs00700302 setPacs00700302(Pacs00700302 value) {
        this.pacs00700302 = value;
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
    public static MxPacs00700302 parse(String xml) {
        return ((MxPacs00700302) MxReadImpl.parse(MxPacs00700302 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs00700302 parse(String xml, MxRead parserImpl) {
        return ((MxPacs00700302) parserImpl.read(MxPacs00700302 .class, xml, _classes));
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
     * Creates an MxPacs00700302 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs00700302 message
     * @return
     *     a new instance of MxPacs00700302
     */
    public final static MxPacs00700302 fromJson(String json) {
        return AbstractMX.fromJson(json, MxPacs00700302 .class);
    }

}
