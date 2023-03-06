
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for pacs.008.003.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pacs00800303"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:pacs.008.003.03")
public class MxPacs00800303
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "pacs.008.003.03", required = true)
    protected Pacs00800303 pacs00800303;
    public final static transient String BUSINESS_PROCESS = "pacs";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 3;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification2 .class, AccountIdentification3Choice.class, AddressType2Code.class, CashAccount7 .class, CashAccount8 .class, CashAccountType2 .class, CashAccountType4Code.class, CashClearingSystem3Code.class, ChargeBearerType2Code.class, ChargesInformation4 .class, ClearingSystemIdentification1Choice.class, CreditTransferTransactionInformation9 .class, CreditorReferenceInformation1 .class, CreditorReferenceType1 .class, CurrencyAndAmount.class, DateAndPlaceOfBirth.class, DocumentType2Code.class, DocumentType3Code.class, EuroMax15Amount.class, EuroMax9Amount.class, FinancialInstitution2 .class, FinancialInstitutionIdentification4 .class, GenericIdentification3 .class, GenericIdentification4 .class, GroupHeader26 .class, Instruction3Code.class, Instruction4Code.class, InstructionForCreditorAgent1 .class, InstructionForNextAgent1 .class, LocalInstrument1Choice.class, MxPacs00800303 .class, NameAndAddress3 .class, OrganisationIdentification2 .class, Pacs00800303 .class, Party2Choice.class, Party5Choice.class, PartyIdentification20 .class, PartyIdentification31 .class, PartyIdentification8 .class, PaymentCategoryPurpose1Code.class, PaymentIdentification2 .class, PaymentTypeInformation16 .class, PersonIdentification3 .class, PostalAddress1 .class, PostalAddress4 .class, Priority2Code.class, Purpose1Choice.class, ReferredDocumentAmount1Choice.class, ReferredDocumentInformation1 .class, ReferredDocumentType1 .class, RegulatoryAuthority.class, RegulatoryReporting2 .class, RegulatoryReportingType1Code.class, RemittanceInformation4 .class, RemittanceLocation1 .class, RemittanceLocationMethod1Code.class, ServiceLevel3Code.class, ServiceLevel6 .class, SettlementDateTimeIndication1 .class, SettlementInformation8 .class, SettlementMethod1Code.class, SettlementTimeRequest1 .class, SimpleIdentificationInformation2 .class, StructuredRegulatoryReporting2 .class, StructuredRemittanceInformation6 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:pacs.008.003.03";

    public MxPacs00800303() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs00800303(final String xml) {
        this();
        MxPacs00800303 tmp = parse(xml);
        pacs00800303 = tmp.getPacs00800303();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs00800303(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pacs00800303 property.
     * 
     * @return
     *     possible object is
     *     {@link Pacs00800303 }
     *     
     */
    public Pacs00800303 getPacs00800303() {
        return pacs00800303;
    }

    /**
     * Sets the value of the pacs00800303 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacs00800303 }
     *     
     */
    public MxPacs00800303 setPacs00800303(Pacs00800303 value) {
        this.pacs00800303 = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxPacs00800303 parse(String xml) {
        return ((MxPacs00800303) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs00800303 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPacs00800303 parse(String xml, MxReadConfiguration conf) {
        return ((MxPacs00800303) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPacs00800303 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs00800303 parse(String xml, MxRead parserImpl) {
        return ((MxPacs00800303) parserImpl.read(MxPacs00800303 .class, xml, _classes));
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
     * Creates an MxPacs00800303 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs00800303 message
     * @return
     *     a new instance of MxPacs00800303
     */
    public final static MxPacs00800303 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPacs00800303 .class);
    }

}
