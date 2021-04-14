/*
 * Landelijke tabellen
 *
 * API voor het ontsluiten van landelijke tabellen die op de website van BZK worden gepubliceerd.
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// WaardeCollectie
    /// </summary>
    [DataContract(Name = "WaardeCollectie")]
    public partial class WaardeCollectie : IEquatable<WaardeCollectie>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WaardeCollectie" /> class.
        /// </summary>
        /// <param name="waarden">waarden.</param>
        public WaardeCollectie(List<Waarde> waarden = default(List<Waarde>))
        {
            this.Waarden = waarden;
        }

        /// <summary>
        /// Gets or Sets Waarden
        /// </summary>
        [DataMember(Name = "waarden", EmitDefaultValue = false)]
        public List<Waarde> Waarden { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class WaardeCollectie {\n");
            sb.Append("  Waarden: ").Append(Waarden).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as WaardeCollectie);
        }

        /// <summary>
        /// Returns true if WaardeCollectie instances are equal
        /// </summary>
        /// <param name="input">Instance of WaardeCollectie to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(WaardeCollectie input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Waarden == input.Waarden ||
                    this.Waarden != null &&
                    input.Waarden != null &&
                    this.Waarden.SequenceEqual(input.Waarden)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Waarden != null)
                    hashCode = hashCode * 59 + this.Waarden.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}